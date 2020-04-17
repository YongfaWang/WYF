package com.huany.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.valueOf;

public class MainActivity extends AppCompatActivity {
    private void addChar(EditText editText, String data) {
        int index = editText.getSelectionStart();
        Editable editable = editText.getText();
        editable.insert(index, data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        *************获取组件ID区域**************
        Button tuige = (Button) findViewById(R.id.tuige);
        Button jia = (Button) findViewById(R.id.bt);
        Button jian = (Button) findViewById(R.id.jian);
        Button cheng = (Button) findViewById(R.id.cheng);
        Button chu = (Button) findViewById(R.id.chu);
        final TextView jstxt = (TextView)findViewById(R.id.textView2);
        final TextView jstxt2 = (TextView)findViewById(R.id.textView3);
        final EditText jiashu = (EditText) findViewById(R.id.bjka);
        final EditText beijiashu = (EditText) findViewById(R.id.bjkb);
        final TextView daan = (TextView) findViewById(R.id.daan);
        //数字键盘
        final Button yi = (Button) findViewById(R.id.button);
        final Button er = (Button) findViewById(R.id.button3);
        final Button san = (Button) findViewById(R.id.button10);
        final Button si = (Button) findViewById(R.id.button5);
        final Button wu = (Button) findViewById(R.id.button6);
        final Button liu = (Button) findViewById(R.id.button11);
        final Button qi = (Button) findViewById(R.id.button8);
        final Button ba = (Button) findViewById(R.id.s);
        final Button jiu = (Button) findViewById(R.id.button12);
        final Button ling = (Button) findViewById(R.id.button13);
//        *************获取组件ID区域**************
        //默认获取焦点
        jiashu.setFocusable(true);
        jiashu.setFocusableInTouchMode(true);
        jiashu.requestFocus();
        //获取焦点后光标的默认位置
        String s = "";
        jiashu.setText(s);
        jiashu.setSelection(s.length());
//
//        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
//        imm.hideSoftInputFromWindow(jiashu.getWindowToken(),0);
//        InputMethodManager imm2 = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
//        imm2.hideSoftInputFromWindow(beijiashu.getWindowToken(),0);
        beijiashu.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener(){

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus){
                    jstxt2.setTextColor(Color.parseColor("#F8C471"));
                }else{
                    jstxt2.setTextColor(Color.parseColor("#F9E79F"));
                    yi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘一
                            addChar(beijiashu,"1");
                        }
                    });
                    er.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘二
                            addChar(beijiashu,"2");
                        }
                    });
                    san.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘三
                            addChar(beijiashu,"3");

                        }
                    });
                    si.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘四
                            addChar(beijiashu,"4");
                        }
                    });
                    wu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘五
                            addChar(beijiashu,"5");
                        }
                    });
                    liu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘六
                            addChar(beijiashu,"6");
                        }
                    });
                    qi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘七
                            addChar(beijiashu,"7");
                        }
                    });
                    ba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘八
                            addChar(beijiashu,"8");
                        }
                    });
                    jiu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘九
                            addChar(beijiashu,"9");
                        }
                    });
                    ling.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘零
                            addChar(beijiashu,"0");
                        }
                    });
                }
            }
        });
        jiashu.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener(){

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus){
                    yi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘一
                            addChar(jiashu,"1");
                        }
                    });
                    er.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘二
                            addChar(jiashu,"2");
                        }
                    });
                    san.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘三
                            addChar(jiashu,"3");

                        }
                    });
                    si.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘四
                            addChar(jiashu,"4");
                        }
                    });
                    wu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘五
                            addChar(jiashu,"5");
                        }
                    });
                    liu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘六
                            addChar(jiashu,"6");
                        }
                    });
                    qi.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘七
                            addChar(jiashu,"7");
                        }
                    });
                    ba.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘八
                            addChar(jiashu,"8");
                        }
                    });
                    jiu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘九
                            addChar(jiashu,"9");
                        }
                    });
                    ling.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //数字键盘零
                            addChar(jiashu,"0");
                        }
                    });
                }
            }
        });

        jia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double i = valueOf(jiashu.getText().toString());
                    double o = valueOf(beijiashu.getText().toString());
                    double c = i + o;
                    daan.setText(String.valueOf(c));
                }catch ( java.lang.NumberFormatException e){
                    Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
        jian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double i = valueOf(jiashu.getText().toString());
                    double o = valueOf(beijiashu.getText().toString());
                    double c = i - o;
                    daan.setText(String.valueOf(c));
                }catch ( java.lang.NumberFormatException e){
                    Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
        cheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double i = valueOf(jiashu.getText().toString());
                    double o = valueOf(beijiashu.getText().toString());
                    double c = i * o;
                    daan.setText(String.valueOf(c));
                }catch ( java.lang.NumberFormatException e){
                    Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
        chu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double i = valueOf(jiashu.getText().toString());
                    double o = valueOf(beijiashu.getText().toString());
                    double c = i / o;
                    if(i == 0) {
                        Toast.makeText(MainActivity.this, "出错(/0的异常)", Toast.LENGTH_LONG).show();
                    }else if(o == 0){
                        Toast.makeText(MainActivity.this, "出错(/0的异常)", Toast.LENGTH_LONG).show();
                    }else{
                        daan.setText(String.valueOf(c));
                    }
                }catch ( java.lang.NumberFormatException e){
                    Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
        //一下是数字键盘
        yi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //数字键盘一
                jiashu.setText("1");
            }
        });
        er.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //数字键盘二
                jiashu.setText("2");
            }
        });
        san.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //数字键盘三
                jiashu.setText("3");

            }
        });
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //数字键盘四
                jiashu.setText("4");
            }
        });
        wu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //数字键盘五
                jiashu.setText("5");
            }
        });
        liu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //数字键盘六
                jiashu.setText("6");
            }
        });
        qi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //数字键盘七
                jiashu.setText("7");
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //数字键盘八
                jiashu.setText("8");
            }
        });
        jiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //数字键盘九
                jiashu.setText("9");
            }
        });
        ling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //数字键盘零
                jiashu.setText("0");
            }
        });
    }
}
