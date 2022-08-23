package com.haker.calculationmethod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_price, et_qty, et_service_fee, et_discount, et_other1, et_other2;
    TextView tv_total_cost;

    int price = 0, qty = 0, service_fee = 0, discount = 0, other1 = 0, other2 = 0;
    int total_cost = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_price = findViewById(R.id.et_price);
        et_qty = findViewById(R.id.et_qty);
        et_service_fee = findViewById(R.id.et_service_fee);
        et_discount = findViewById(R.id.et_discount);
        et_other1 = findViewById(R.id.et_other1);
        et_other2 = findViewById(R.id.et_other2);
        tv_total_cost = findViewById(R.id.tv_total_cost);

        et_price.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (et_price.length() != 0) {
                    price = Integer.parseInt(et_price.getText().toString());
                }
                if (et_qty.length() != 0) {
                    qty = Integer.parseInt(et_qty.getText().toString());
                }
                if (et_service_fee.length() != 0) {
                    service_fee = Integer.parseInt(et_service_fee.getText().toString());
                }
                if (et_discount.length() != 0) {
                    discount = Integer.parseInt(et_discount.getText().toString());
                }
                if (et_other1.length() != 0) {
                    other1 = Integer.parseInt(et_other1.getText().toString());
                }
                if (et_other2.length() != 0) {
                    other2 = Integer.parseInt(et_other2.getText().toString());
                }
                if (et_price.length() == 0) {
                    price = 0;
                }
                calculate(price, qty, service_fee, discount, other1, other2);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        et_qty.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (et_price.length() != 0) {
                    price = Integer.parseInt(et_price.getText().toString());
                }
                if (et_qty.length() != 0) {
                    qty = Integer.parseInt(et_qty.getText().toString());
                }
                if (et_service_fee.length() != 0) {
                    service_fee = Integer.parseInt(et_service_fee.getText().toString());
                }
                if (et_discount.length() != 0) {
                    discount = Integer.parseInt(et_discount.getText().toString());
                }
                if (et_other1.length() != 0) {
                    other1 = Integer.parseInt(et_other1.getText().toString());
                }
                if (et_other2.length() != 0) {
                    other2 = Integer.parseInt(et_other2.getText().toString());
                }

                calculate(price, qty, service_fee, discount, other1, other2);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        et_service_fee.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (et_price.length() != 0) {
                    price = Integer.parseInt(et_price.getText().toString());
                }
                if (et_qty.length() != 0) {
                    qty = Integer.parseInt(et_qty.getText().toString());
                }
                if (et_service_fee.length() != 0) {
                    service_fee = Integer.parseInt(et_service_fee.getText().toString());
                }
                if (et_discount.length() != 0) {
                    discount = Integer.parseInt(et_discount.getText().toString());
                }
                if (et_other1.length() != 0) {
                    other1 = Integer.parseInt(et_other1.getText().toString());
                }
                if (et_other2.length() != 0) {
                    other2 = Integer.parseInt(et_other2.getText().toString());
                }
                if (et_service_fee.length() == 0) {
                    service_fee = 0;
                }

                calculate(price, qty, service_fee, discount, other1, other2);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        et_discount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (et_price.length() != 0) {
                    price = Integer.parseInt(et_price.getText().toString());
                }
                if (et_qty.length() != 0) {
                    qty = Integer.parseInt(et_qty.getText().toString());
                }
                if (et_service_fee.length() != 0) {
                    service_fee = Integer.parseInt(et_service_fee.getText().toString());
                }
                if (et_discount.length() != 0) {
                    discount = Integer.parseInt(et_discount.getText().toString());
                }
                if (et_other1.length() != 0) {
                    other1 = Integer.parseInt(et_other1.getText().toString());
                }
                if (et_other2.length() != 0) {
                    other2 = Integer.parseInt(et_other2.getText().toString());
                }
                if (et_discount.length() == 0) {
                    discount = 0;
                }

                calculate(price, qty, service_fee, discount, other1, other2);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        et_other1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (et_price.length() != 0) {
                    price = Integer.parseInt(et_price.getText().toString());
                }
                if (et_qty.length() != 0) {
                    qty = Integer.parseInt(et_qty.getText().toString());
                }
                if (et_service_fee.length() != 0) {
                    service_fee = Integer.parseInt(et_service_fee.getText().toString());
                }
                if (et_discount.length() != 0) {
                    discount = Integer.parseInt(et_discount.getText().toString());
                }
                if (et_other1.length() != 0) {
                    other1 = Integer.parseInt(et_other1.getText().toString());
                }
                if (et_other2.length() != 0) {
                    other2 = Integer.parseInt(et_other2.getText().toString());
                }
                if (et_other1.length() == 0) {
                    other1 = 0;
                }

                calculate(price, qty, service_fee, discount, other1, other2);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        et_other2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (et_price.length() != 0) {
                    price = Integer.parseInt(et_price.getText().toString());
                }
                if (et_qty.length() != 0) {
                    qty = Integer.parseInt(et_qty.getText().toString());
                }
                if (et_service_fee.length() != 0) {
                    service_fee = Integer.parseInt(et_service_fee.getText().toString());
                }
                if (et_discount.length() != 0) {
                    discount = Integer.parseInt(et_discount.getText().toString());
                }
                if (et_other1.length() != 0) {
                    other1 = Integer.parseInt(et_other1.getText().toString());
                }
                if (et_other2.length() != 0) {
                    other2 = Integer.parseInt(et_other2.getText().toString());
                }
                if (et_other2.length() == 0) {
                    other2 = 0;
                }

                calculate(price, qty, service_fee, discount, other1, other2);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void calculate(int p, int q, int s, int d, int o1, int o2) {
        total_cost = ((p * q) + s) - d + (o1 + o2);
        Log.i("total_cost", total_cost + "");
        tv_total_cost.setText(total_cost + "");
    }
}
