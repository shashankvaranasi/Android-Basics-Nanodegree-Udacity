/*
 * PROJECT LICENSE
 *
 * This project was submitted by Shashank Varanasi as part of the Nanodegree At Udacity.
 *
 * As part of Udacity Honor code, your submissions must be your own work, hence
 * submitting this project as yours will cause you to break the Udacity Honor Code
 * and the suspension of your account.
 *
 * Me, the author of the project, allow you to check the code as a reference, but if
 * you submit it, it's your own responsibility if you get expelled.
 *
 * Copyright (c) 2020 Shashank Varanasi
 *
 * Besides the above notice, the following license applies and this license notice
 * must be included in all works derived from this project.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.techieshashank.quizarrio;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.techieshashank.quizarrio.R;

public class MainActivity extends AppCompatActivity {
    int correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View v) {

        String wrong = "Wrong :";

        RadioButton q1 = (RadioButton) findViewById(R.id.CorrectAnswerQ1);
        if (q1.isChecked())
            correct++;
        else
            wrong += "Q1,";

        RadioButton q2 = (RadioButton) findViewById(R.id.CorrectAnswerQ2);
        if (q2.isChecked())
            correct++;
        else
            wrong += "Q2,";

        RadioButton q3 = (RadioButton) findViewById(R.id.CorrectAnswerQ3);
        if (q3.isChecked())
            correct++;
        else
            wrong += "Q3,";

        RadioButton q4 = (RadioButton) findViewById(R.id.CorrectAnswerQ4);
        if (q4.isChecked())
            correct++;
        else
            wrong += "Q4,";

        CheckBox q5_1 = (CheckBox) findViewById(R.id.CorrectAnswerQ5_o1);
        CheckBox q5_2 = (CheckBox) findViewById(R.id.CorrectAnswerQ5_o2);
        CheckBox q5_3 = (CheckBox) findViewById(R.id.q5_o3);

        if (q5_1.isChecked() && q5_2.isChecked() && !(q5_3.isChecked()))
            correct++;
        else
            wrong += "Q5,";

        String a6 = getResources().getString(R.string.a6);
        EditText q6 = (EditText) findViewById(R.id.CorrectAnswerQ6);
        if (a6.equals(q6.getText().toString()))
            correct++;
        else
            wrong += "Q6,";

        RadioButton q7 = (RadioButton) findViewById(R.id.CorrectAnswerQ7);
        if (q7.isChecked())
            correct++;
        else
            wrong += "Q7,";

        Toast.makeText(this, "Score: " + correct + " /7\n" + wrong, Toast.LENGTH_LONG).show();

        correct = 0;
    }
}
