package com.example.firstbigpractice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.utils.JinZhi;
import com.example.utils.计算;

public class FirstArctivity extends AppCompatActivity {


    StringBuffer show_Number = new StringBuffer();    //显示计算公式

    //Menu部分
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.help_item:
                AlertDialog.Builder builder = new AlertDialog.Builder(FirstArctivity.this);
                builder.setMessage("这是一个帮助");
                builder.setTitle("HELP");
                builder.show();
                break;
            case R.id.exit_item:
                android.os.Process.killProcess(android.os.Process.myPid());//退出进程
                break;
            case R.id.进制转换_item:
                Intent intent = new Intent(FirstArctivity.this, JinZhi.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    //弹出的对话框
/*    public void Talking(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(FirstArctivity.this);
        builder.setMessage("这是一个帮助");
        builder.setTitle("HELP");
        builder.show();
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int width = this.getWindowManager().getDefaultDisplay().getWidth();
        int height = this.getWindowManager().getDefaultDisplay().getHeight();
        if (width > height) {
            setContentView(R.layout.test_land);
            //button部分
            Button button0 = findViewById(R.id.button0);
            Button buttonAC = findViewById(R.id.buttonAC);
            Button button小数点 = findViewById(R.id.button小数点);
            Button button等号 = findViewById(R.id.button等号);
            Button button1 = findViewById(R.id.button1);
            Button button2 = findViewById(R.id.button2);
            Button button3 = findViewById(R.id.button3);
            Button button4 = findViewById(R.id.button4);
            Button button5 = findViewById(R.id.button5);
            Button button6 = findViewById(R.id.button6);
            Button button7 = findViewById(R.id.button7);
            Button button8 = findViewById(R.id.button8);
            Button button9 = findViewById(R.id.button9);
            Button button加号 = findViewById(R.id.button加号);
            Button button减号 = findViewById(R.id.button减号);
            Button button乘号 = findViewById(R.id.button乘号);
            Button button除号 = findViewById(R.id.button除号);
            Button button回退 = findViewById(R.id.button回退);
            Button button百分号 = findViewById(R.id.button百分号);
            Button button左括号 = findViewById(R.id.button左括号);
            Button button右括号 = findViewById(R.id.button右括号);
            Button button平方 = findViewById(R.id.button平方);
            Button buttonSin = findViewById(R.id.buttonSin);
            Button buttonCos = findViewById(R.id.buttonCos);
            Button button绝对值 = findViewById(R.id.button绝对值);
            Button button阶乘 = findViewById(R.id.button阶乘);
            Button buttonπ = findViewById(R.id.buttonπ);
            Button button立方 = findViewById(R.id.button立方);
            Button button正负号 = findViewById(R.id.button正负号);
            Button button根号 = findViewById(R.id.button根号);
            Button buttonE = findViewById(R.id.buttonE);
            Button buttonLn = findViewById(R.id.buttonLn);
            Button buttonLog = findViewById(R.id.buttonLog);
            Button button多次方 = findViewById(R.id.button多次方);
            //EditText部分
            final EditText text输入框 = findViewById(R.id.text输入);
            text输入框.setFocusableInTouchMode(true);//不允许编辑
            text输入框.setClickable(true);
            text输入框.setEnabled(false);
            text输入框.setCursorVisible(false);
            text输入框.getSelectionStart();
            text输入框.getSelectionEnd();
            text输入框.requestFocus();
            text输入框.setHorizontallyScrolling(false);
            text输入框.setFocusable(true);
            //点击事件
            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("0");
                    text输入框.setText(show_Number);
                }
            });
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("1");
                    text输入框.setText(show_Number);
                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("2");
                    text输入框.setText(show_Number);
                }
            });
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("3");
                    text输入框.setText(show_Number);
                }
            });
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("4");
                    text输入框.setText(show_Number);
                }
            });
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("5");
                    text输入框.setText(show_Number);
                }
            });
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("6");
                    text输入框.setText(show_Number);
                }
            });
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("7");
                    text输入框.setText(show_Number);
                }
            });
            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("8");
                    text输入框.setText(show_Number);
                }
            });
            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("9");
                    text输入框.setText(show_Number);
                }
            });
            button加号.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("+");
                    text输入框.setText(show_Number);
                }
            });
            button减号.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("-");
                    text输入框.setText(show_Number);
                }
            });
            button乘号.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("×");
                    text输入框.setText(show_Number);
                }
            });
            button除号.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("÷");
                    text输入框.setText(show_Number);
                }
            });
            button小数点.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append(".");
                    text输入框.setText(show_Number);
                }
            });
            button百分号.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("%");
                    text输入框.setText(show_Number);
                }
            });
            buttonAC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    text输入框.setText("请输入");
                    show_Number.delete(0, show_Number.length());
                }
            });
            button回退.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (show_Number.length() - 1 >= 0) {
                        show_Number.deleteCharAt(show_Number.length() - 1);
                        text输入框.setText(show_Number);
                    } else
                        text输入框.setText("请输入");      //在输入面板中没有对象时不会闪退
                }
            });
            button左括号.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("(");
                    text输入框.setText(show_Number);
                }
            });
            button右括号.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append(")");
                    text输入框.setText(show_Number);
                }
            });
            buttonSin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("Sin(");
                    text输入框.setText(show_Number);
                }
            });
            buttonCos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("Cos(");
                    text输入框.setText(show_Number);
                }
            });
            button绝对值.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("Abs(");
                    text输入框.setText(show_Number);
                }
            });
            buttonE.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("E(");
                    text输入框.setText(show_Number);
                }
            });
            buttonLn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("Ln(");
                    text输入框.setText(show_Number);
                }
            });
            buttonLog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("Lg(");
                    text输入框.setText(show_Number);
                }
            });
            buttonπ.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("π");
                    text输入框.setText(show_Number);
                }
            });
            button平方.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("^2");
                    text输入框.setText(show_Number);
                }
            });
            button多次方.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("^");
                    text输入框.setText(show_Number);
                }
            });
            button根号.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("√");
                    text输入框.setText(show_Number);
                }
            });
            button阶乘.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("!");
                    text输入框.setText(show_Number);
                }
            });
            button立方.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("^3");
                    text输入框.setText(show_Number);
                }
            });
            button等号.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        String res = show_Number.toString();
                        if(res.substring(0,1).equals("-")){
                            res = "0" + res;
                        }
                        StringBuffer postfix = 计算.toPostfix(res);
                        text输入框.setText(计算.toValue(postfix) + ""); //不能直接int入参
                        show_Number.delete(0, show_Number.length());
                        show_Number.append(计算.toValue(postfix) + "");
                    }catch (Exception e){
                        text输入框.setText("error");
                    }
                }
            });
            button正负号.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        String res = show_Number.toString();
                        if(res.substring(0,1).equals("-")){
                            res = "0" + res;
                        }
                        StringBuffer postfix = 计算.toPostfix(res);
                        text输入框.setText(计算.toValue(postfix)*(-1) + ""); //不能直接int入参
                        show_Number.delete(0, show_Number.length());
                        show_Number.append(计算.toValue(postfix)*(-1) + "");
                    }catch (Exception e){
                        text输入框.setText("error");
                    }

                }
            });
        } else {
            setContentView(R.layout.activity_main);
            //button部分(正常界面)----------------------------------------------------------------
            Button button0 = findViewById(R.id.button0);
            Button buttonAC = findViewById(R.id.buttonAC);
            Button button小数点 = findViewById(R.id.button小数点);
            Button button等号 = findViewById(R.id.button等号);
            Button button1 = findViewById(R.id.button1);
            Button button2 = findViewById(R.id.button2);
            Button button3 = findViewById(R.id.button3);
            Button button4 = findViewById(R.id.button4);
            Button button5 = findViewById(R.id.button5);
            Button button6 = findViewById(R.id.button6);
            Button button7 = findViewById(R.id.button7);
            Button button8 = findViewById(R.id.button8);
            Button button9 = findViewById(R.id.button9);
            Button button加号 = findViewById(R.id.button加号);
            Button button减号 = findViewById(R.id.button减号);
            Button button乘号 = findViewById(R.id.button乘号);
            Button button除号 = findViewById(R.id.button除号);
            Button button回退 = findViewById(R.id.button回退);
            Button button百分号 = findViewById(R.id.button百分号);


            //EditText部分------------------------------------------------------------------------------
            final EditText text输入框 = findViewById(R.id.text输入);
            text输入框.setFocusableInTouchMode(true);//不允许编辑
            text输入框.setClickable(true);
            text输入框.setEnabled(false);
            text输入框.setCursorVisible(false);
            text输入框.getSelectionStart();
            text输入框.getSelectionEnd();
            text输入框.requestFocus();
            text输入框.setHorizontallyScrolling(false);
            text输入框.setFocusable(true);


            //button监听部分----------------------------------------------------------------------------------
            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("0");
                    text输入框.setText(show_Number);
                }
            });
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("1");
                    text输入框.setText(show_Number);
                }
            });
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("2");
                    text输入框.setText(show_Number);
                }
            });
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("3");
                    text输入框.setText(show_Number);
                }
            });
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("4");
                    text输入框.setText(show_Number);
                }
            });
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("5");
                    text输入框.setText(show_Number);
                }
            });
            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("6");
                    text输入框.setText(show_Number);
                }
            });
            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("7");
                    text输入框.setText(show_Number);
                }
            });
            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("8");
                    text输入框.setText(show_Number);
                }
            });
            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("9");
                    text输入框.setText(show_Number);
                }
            });
            button加号.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("+");
                    text输入框.setText(show_Number);
                }
            });
            button减号.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("-");
                    text输入框.setText(show_Number);
                }
            });
            button乘号.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("×");
                    text输入框.setText(show_Number);
                }
            });
            button除号.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("÷");
                    text输入框.setText(show_Number);
                }
            });
            button小数点.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append(".");
                    text输入框.setText(show_Number);
                }
            });
            button百分号.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    show_Number.append("%");
                    text输入框.setText(show_Number);
                }
            });
            buttonAC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    text输入框.setText("请输入");
                    show_Number.delete(0, show_Number.length());
                }
            });
            button回退.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (show_Number.length() - 1 >= 0) {
                        show_Number.deleteCharAt(show_Number.length() - 1);
                        text输入框.setText(show_Number);
                    } else
                        text输入框.setText("请输入");      //在输入面板中没有对象时不会闪退
                }
            });

            button等号.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        String res = show_Number.toString();
                        if(res.substring(0,1).equals("-")){
                            res = "0" + res;
                        }
                        StringBuffer postfix = 计算.toPostfix(res);
                        text输入框.setText(计算.toValue(postfix) + ""); //不能直接int入参
                        show_Number.delete(0, show_Number.length());
                        show_Number.append(计算.toValue(postfix) + "");
                    }catch (Exception e){
                        text输入框.setText("error");
                    }

                }
            });
        }
    }
}
