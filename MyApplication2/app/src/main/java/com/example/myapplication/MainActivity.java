<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:background="#e4e4e4"
tools:context=".MainActivity"
tools:ignore="HardcodedText">

    <View
android:id="@+id/view"
android:layout_width="match_parent"
android:layout_height="128dp"
android:background="@drawable/custom_rectangle"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent" />

    <ImageButton
android:id="@+id/backB"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginStart="16dp"
android:layout_marginTop="16dp"
android:background="?attr/selectableItemBackground"
android:padding="8dp"
android:src="@drawable/ic_back"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent" />

    <TextView
android:id="@+id/textView"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginStart="8dp"
android:layout_marginTop="16dp"
android:gravity="center_horizontal"
android:text="Dashboard"
android:textColor="@color/white"
android:textSize="28sp"
android:textStyle="bold"
app:layout_constraintStart_toEndOf="@+id/backB"
app:layout_constraintTop_toTopOf="parent" />

    <ImageButton
android:id="@+id/logOutB"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginTop="16dp"
android:layout_marginEnd="16dp"
android:background="?attr/selectableItemBackground"
android:padding="8dp"
android:src="@drawable/ic_logout"
app:layout_constraintCircleRadius="24dp"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintTop_toTopOf="parent" />

    <androidx.cardview.widget.CardView
android:id="@+id/cardView"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_marginStart="16dp"
android:layout_marginTop="16dp"
android:layout_marginEnd="16dp"
android:elevation="12dp"
app:cardCornerRadius="16dp"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/textView">

        <androidx.constraintlayout.widget.ConstraintLayout
android:layout_width="match_parent"
android:layout_height="match_parent">

            <TextView
android:id="@+id/textView2"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginStart="16dp"
android:layout_marginTop="16dp"
android:text="James Smith"
android:textColor="@color/colorPrimary"
android:textSize="24sp"
android:textStyle="bold"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent" />

            <TextView
android:id="@+id/textView3"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginTop="4dp"
android:text="Indian Institute of Technology"
android:textColor="@android:color/black"
android:textSize="14sp"
app:layout_constraintStart_toStartOf="@+id/textView2"
app:layout_constraintTop_toBottomOf="@+id/textView2" />

            <com.google.android.material.button.MaterialButton
android:id="@+id/todoB"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginStart="16dp"
android:layout_marginTop="16dp"
android:layout_marginBottom="8dp"
android:text="TODO LIST"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/textView3" />

            <com.google.android.material.button.MaterialButton
android:id="@+id/editProfileB"
style="@style/Widget.Material3.Button.OutlinedButton"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginStart="8dp"
android:text="EDIT PROFILE"
android:textColor="@color/colorPrimary"
app:layout_constraintBottom_toBottomOf="@+id/todoB"
app:layout_constraintStart_toEndOf="@+id/todoB" />

            <ImageButton
android:id="@+id/profileB"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginEnd="32dp"
android:background="?attr/selectableItemBackground"
android:src="@drawable/person"
app:layout_constraintBottom_toBottomOf="@+id/textView3"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintTop_toTopOf="@+id/textView2"
app:tint="@color/colorPrimary" />

        </androidx.constraintlayout.widget.ConstraintLayout>

    </androidx.cardview.widget.CardView>

    <LinearLayout
android:id="@+id/linearLayout"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_marginTop="12dp"
android:gravity="center_horizontal"
android:orientation="horizontal"
android:weightSum="2"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/cardView">

        <androidx.cardview.widget.CardView
android:id="@+id/contributeCard"
android:layout_width="128dp"
android:layout_height="128dp"
android:layout_margin="8dp"
android:layout_marginEnd="16dp"
android:clickable="true"
android:elevation="16dp"
android:focusable="true"
android:foreground="?android:attr/selectableItemBackground"
app:cardCornerRadius="16dp">

            <androidx.constraintlayout.widget.ConstraintLayout
android:layout_width="match_parent"
android:layout_height="match_parent">

                <ImageView
android:id="@+id/image_view1"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:src="@drawable/write"
app:layout_constraintBottom_toTopOf="@+id/textView1"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent" />

                <TextView
android:id="@+id/textView1"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:gravity="center"
android:text="CONTRIBUTE"
android:textAllCaps="true"
android:textColor="@color/colorPrimary"
android:textSize="14sp"
android:textStyle="bold"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/image_view1" />

            </androidx.constraintlayout.widget.ConstraintLayout>

        </androidx.cardview.widget.CardView>

        <androidx.cardview.widget.CardView
android:id="@+id/practiceCard"
android:layout_width="128dp"
android:layout_height="128dp"
android:layout_margin="8dp"
android:layout_marginStart="16dp"
android:clickable="true"
android:elevation="16dp"
android:focusable="true"
android:foreground="?android:attr/selectableItemBackground"
app:cardCornerRadius="16dp">

            <androidx.constraintlayout.widget.ConstraintLayout
android:layout_width="match_parent"
android:layout_height="match_parent">

                <ImageView
android:id="@+id/image_view20"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:src="@drawable/practice"
app:layout_constraintBottom_toTopOf="@+id/textView20"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent" />

                <TextView
android:id="@+id/textView20"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:gravity="center"
android:text="PRACTICE"
android:textAllCaps="true"
android:textColor="@color/colorPrimary"
android:textSize="14sp"
android:textStyle="bold"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/image_view20" />

            </androidx.constraintlayout.widget.ConstraintLayout>

        </androidx.cardview.widget.CardView>

    </LinearLayout>

    <LinearLayout
android:id="@+id/linearLayout2"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:gravity="center_horizontal"
android:orientation="horizontal"
android:weightSum="2"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/linearLayout">

        <androidx.cardview.widget.CardView
android:id="@+id/learnCard"
android:layout_width="128dp"
android:layout_height="128dp"
android:layout_margin="8dp"
android:layout_marginEnd="16dp"
android:clickable="true"
android:elevation="16dp"
android:focusable="true"
android:foreground="?android:attr/selectableItemBackground"
app:cardCornerRadius="16dp">

            <androidx.constraintlayout.widget.ConstraintLayout
android:layout_width="match_parent"
android:layout_height="match_parent">

                <ImageView
android:id="@+id/image_view21"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:src="@drawable/learn"
app:layout_constraintBottom_toTopOf="@+id/textView21"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent" />

                <TextView
android:id="@+id/textView21"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:gravity="center"
android:text="LEARN"
android:textAllCaps="true"
android:textColor="@color/colorPrimary"
android:textSize="14sp"
android:textStyle="bold"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/image_view21" />

            </androidx.constraintlayout.widget.ConstraintLayout>

        </androidx.cardview.widget.CardView>

        <androidx.cardview.widget.CardView
android:id="@+id/interestsCard"
android:layout_width="128dp"
android:layout_height="128dp"
android:layout_margin="8dp"
android:layout_marginStart="16dp"
android:clickable="true"
android:elevation="16dp"
android:focusable="true"
android:foreground="?android:attr/selectableItemBackground"
app:cardCornerRadius="16dp">

            <androidx.constraintlayout.widget.ConstraintLayout
android:layout_width="match_parent"
android:layout_height="match_parent">

                <ImageView
android:id="@+id/image_view22"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:src="@drawable/interests"
app:layout_constraintBottom_toTopOf="@+id/textView22"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent" />

                <TextView
android:id="@+id/textView22"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:gravity="center"
android:text="INTERESTS"
android:textAllCaps="true"
android:textColor="@color/colorPrimary"
android:textSize="14sp"
android:textStyle="bold"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/image_view22" />

            </androidx.constraintlayout.widget.ConstraintLayout>

        </androidx.cardview.widget.CardView>

    </LinearLayout>

    <LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:gravity="center_horizontal"
android:orientation="horizontal"
android:weightSum="2"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/linearLayout2">

        <androidx.cardview.widget.CardView
android:id="@+id/helpCard"
android:layout_width="128dp"
android:layout_height="128dp"
android:layout_margin="8dp"
android:layout_marginEnd="16dp"
android:clickable="true"
android:elevation="16dp"
android:focusable="true"
android:foreground="?android:attr/selectableItemBackground"
app:cardCornerRadius="16dp">

            <androidx.constraintlayout.widget.ConstraintLayout
android:layout_width="match_parent"
android:layout_height="match_parent">

                <ImageView
android:id="@+id/image_view23"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:src="@drawable/help"
app:layout_constraintBottom_toTopOf="@+id/textView23"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent" />

                <TextView
android:id="@+id/textView23"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:gravity="center"
android:text="HELP"
android:textAllCaps="true"
android:textColor="@color/colorPrimary"
android:textSize="14sp"
android:textStyle="bold"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/image_view23" />

            </androidx.constraintlayout.widget.ConstraintLayout>

        </androidx.cardview.widget.CardView>

        <androidx.cardview.widget.CardView
android:id="@+id/settingsCard"
android:layout_width="128dp"
android:layout_height="128dp"
android:layout_margin="8dp"
android:layout_marginStart="16dp"
android:clickable="true"
android:elevation="16dp"
android:focusable="true"
android:foreground="?android:attr/selectableItemBackground"
app:cardCornerRadius="16dp">

            <androidx.constraintlayout.widget.ConstraintLayout
android:layout_width="match_parent"
android:layout_height="match_parent">

                <ImageView
android:id="@+id/image_view"
android:layout_width="0dp"
android:layout_height="wrap_content"
android:src="@drawable/settings"
app:layout_constraintBottom_toTopOf="@+id/textView4"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent" />

                <TextView
android:id="@+id/textView4"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:gravity="center"
android:text="SETTINGS"
android:textAllCaps="true"
android:textColor="@color/colorPrimary"
android:textSize="14sp"
android:textStyle="bold"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintHorizontal_bias="0.5"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toBottomOf="@+id/image_view" />

            </androidx.constraintlayout.widget.ConstraintLayout>

        </androidx.cardview.widget.CardView>

    </LinearLayout>

</androidx.constraintlayout.widget.ConstraintLayout>
