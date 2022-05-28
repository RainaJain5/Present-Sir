// Generated by view binder compiler. Do not edit!
package com.raina.PresentSir.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.raina.PresentSir.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class StudentCardBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView cardImage;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView studentEmail;

  @NonNull
  public final TextView studentName;

  @NonNull
  public final TextView studentRollNo;

  @NonNull
  public final TextView textView1;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  private StudentCardBinding(@NonNull CardView rootView, @NonNull ImageView cardImage,
      @NonNull CardView cardView, @NonNull TextView studentEmail, @NonNull TextView studentName,
      @NonNull TextView studentRollNo, @NonNull TextView textView1, @NonNull TextView textView2,
      @NonNull TextView textView3) {
    this.rootView = rootView;
    this.cardImage = cardImage;
    this.cardView = cardView;
    this.studentEmail = studentEmail;
    this.studentName = studentName;
    this.studentRollNo = studentRollNo;
    this.textView1 = textView1;
    this.textView2 = textView2;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static StudentCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StudentCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.student_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StudentCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardImage;
      ImageView cardImage = ViewBindings.findChildViewById(rootView, id);
      if (cardImage == null) {
        break missingId;
      }

      CardView cardView = (CardView) rootView;

      id = R.id.studentEmail;
      TextView studentEmail = ViewBindings.findChildViewById(rootView, id);
      if (studentEmail == null) {
        break missingId;
      }

      id = R.id.studentName;
      TextView studentName = ViewBindings.findChildViewById(rootView, id);
      if (studentName == null) {
        break missingId;
      }

      id = R.id.studentRollNo;
      TextView studentRollNo = ViewBindings.findChildViewById(rootView, id);
      if (studentRollNo == null) {
        break missingId;
      }

      id = R.id.textView1;
      TextView textView1 = ViewBindings.findChildViewById(rootView, id);
      if (textView1 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new StudentCardBinding((CardView) rootView, cardImage, cardView, studentEmail,
          studentName, studentRollNo, textView1, textView2, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}