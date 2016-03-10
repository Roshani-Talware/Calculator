package anisia.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.StringTokenizer;

public class Principale extends AppCompatActivity {

    String result_text = "";
    String resultIntra = "";
    int operator = 0;
    float result = 0;
    boolean equals = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principale);
    }

    public void Remove(View view) {
        result_text = "";
        TextView resultTextView = (TextView) findViewById(R.id.result_text);
        resultTextView.setText(String.valueOf(result_text));
        result = 0;
        TextView resultIntraTextView = (TextView) findViewById(R.id.result_intra);
        resultIntraTextView.setText("");
    }

    public void Cancel(View view){
        if(!result_text.isEmpty()){
            result_text = result_text.substring(0, result_text.length()-1);
        }
        TextView resultTextView = (TextView) findViewById(R.id.result_text);
        resultTextView.setText(result_text);
    }

    public void One(View view) {
        if (result_text == "" || equals == true) {
            result_text = "1";
        } else {
            result_text += "1";
        }
        TextView resultTextView = (TextView) findViewById(R.id.result_text);
        resultTextView.setText(result_text);
        equals = false;
    }

    public void Two(View view) {
        if (result_text == "" || equals == true) {
            result_text = "2";
        } else {
            result_text += "2";
        }
        TextView resultTextView = (TextView) findViewById(R.id.result_text);
        resultTextView.setText(result_text);
        equals = false;
    }

    public void Three(View view) {
        if (result_text == "" || equals == true) {
            result_text = "3";
        } else {
            result_text += "3";
        }
        TextView resultTextView = (TextView) findViewById(R.id.result_text);
        resultTextView.setText(result_text);
        equals = false;
    }

    public void Four(View view) {
        if (result_text == "" || equals == true) {
            result_text = "4";
        } else {
            result_text += "4";
        }
        TextView resultTextView = (TextView) findViewById(R.id.result_text);
        resultTextView.setText(result_text);
        equals = false;
    }

    public void Five(View view) {
        if (result_text == "" || equals == true) {
            result_text = "5";
        } else {
            result_text += "5";
        }
        TextView resultTextView = (TextView) findViewById(R.id.result_text);
        resultTextView.setText(result_text);
        equals = false;
    }

    public void Six(View view) {
        if (result_text == "" || equals == true) {
            result_text = "6";
        } else {
            result_text += "6";
        }
        TextView resultTextView = (TextView) findViewById(R.id.result_text);
        resultTextView.setText(result_text);
        equals = false;
    }

    public void Zero(View view) {
        if (result_text == "" || equals == true) {
            result_text = "0";
        } else {
            result_text += "0";
        }
        TextView resultTextView = (TextView) findViewById(R.id.result_text);
        resultTextView.setText(result_text);
        equals = false;
    }

    public void Seven(View view) {
        if (result_text == "" || equals == true) {
            result_text = "7";
        } else {
            result_text += "7";
        }
        TextView resulTextView = (TextView) findViewById(R.id.result_text);
        resulTextView.setText(result_text);
        equals = false;
    }

    public void Eight(View view) {
        if (result_text == "" || equals == true) {
            result_text = "8";
        } else {
            result_text += "8";
        }
        TextView resultTextView = (TextView) findViewById(R.id.result_text);
        resultTextView.setText(result_text);
        equals = false;
    }

    public void Nine(View view) {
        if (result_text == "") {
            result_text = "9";
        } else {
            result_text += "9";
        }
        TextView resultTextView = (TextView) findViewById(R.id.result_text);
        resultTextView.setText(result_text);
        equals = false;
    }

    public void Decimal(View view) {
        if (result_text == "") {
            result_text = "0.";
        } else if (result_text.endsWith("+")) {
            result_text += "0.";
        } else if (result_text.endsWith("-")) {
            result_text += "0.";
        } else if (result_text.endsWith("*")) {
            result_text += "0.";
        } else if (result_text.endsWith("/")) {
            result_text += "0.";
        } else {
            result_text += ".";
        }
        TextView resultTextView = (TextView) findViewById(R.id.result_text);
        resultTextView.setText(result_text);
    }

    public void Plus(View view) {
        if (result_text.equals("")) {
            result_text += "0+";
        } else if (result_text.endsWith("-")) {
            result_text = result_text.substring(0, result_text.length() - 1);
            result_text += "+";
        } else if (result_text.endsWith("*")) {
            result_text = result_text.substring(0, result_text.length() - 1);
            result_text += "+";
        } else if (result_text.endsWith("/")) {
            result_text = result_text.substring(0, result_text.length() - 1);
            result_text += "+";
        } else if (!result_text.endsWith("+")) {
            result_text += "+";
        }
        TextView resultTextView = (TextView) findViewById(R.id.result_text);
        resultTextView.setText(result_text);
        equals = false;
    }

    public void Moltiplication(View view) {
        if (result_text.equals("")) {
            result_text += "0*";
        } else if (result_text.endsWith("-")) {
            result_text = result_text.substring(0, result_text.length() - 1);
            result_text += "*";
        } else if (result_text.endsWith("+")) {
            result_text = result_text.substring(0, result_text.length() - 1);
            result_text += "*";
        } else if (result_text.endsWith("/")) {
            result_text = result_text.substring(0, result_text.length() - 1);
            result_text += "*";
        } else if (!result_text.endsWith("*")) {
            result_text += "*";
        }
        TextView resultTextView = (TextView) findViewById(R.id.result_text);
        resultTextView.setText(result_text);
        equals = false;
    }

    public void Divide(View view) {
        if (result_text.equals("")) {
            result_text += "0/";
        } else if (result_text.endsWith("-")) {
            result_text = result_text.substring(0, result_text.length() - 1);
            result_text += "/";
        } else if (result_text.endsWith("*")) {
            result_text = result_text.substring(0, result_text.length() - 1);
            result_text += "/";
        } else if (result_text.endsWith("+")) {
            result_text = result_text.substring(0, result_text.length() - 1);
            result_text += "/";
        } else if (!result_text.endsWith("/")) {
            result_text += "/";
        }
        TextView resultTextView = (TextView) findViewById(R.id.result_text);
        resultTextView.setText(result_text);
        equals = false;
    }

    public void Minus(View view) {
        if (result_text.equals("")) {
            result_text += "0-";
        } else if (result_text.endsWith("+")) {
            result_text = result_text.substring(0, result_text.length() - 1);
            result_text += "-";
        } else if (result_text.endsWith("*")) {
            result_text = result_text.substring(0, result_text.length() - 1);
            result_text += "-";
        } else if (result_text.endsWith("/")) {
            result_text = result_text.substring(0, result_text.length() - 1);
            result_text += "-";
        } else if (!result_text.endsWith("-")) {
            result_text += "-";
        }
        TextView resultTextView = (TextView) findViewById(R.id.result_text);
        resultTextView.setText(result_text);
        equals = false;
    }

    //TODO se inserisci due o più segni consecutivi li scrive tutti in result_text
    //todo dopo aver schiacciato = volendo continuare l eoperazioni da errore
    public void Equals(View view) {
        String delims = "+-/*";
        int signPos = 0;
        String sign = "";
        String current = "";
        StringTokenizer st = new StringTokenizer(result_text, delims);
        int numberToken = st.countTokens();
        Log.i("VALUE OF numbertok", String.valueOf(numberToken));
        for (int i = 0; i < numberToken; i++) {
            current = st.nextToken();
            if (i == 0) {
                Log.i("VALUE OF current ", String.valueOf(current));
                signPos = current.length();
                sign = String.valueOf(result_text.charAt(signPos));
                result += Float.valueOf(current);
            } else if (i == numberToken - 1) {
                if (sign.equals("+")) {
                    result += Float.valueOf(current);
                } else if (sign.equals("-")) {
                    result -= Float.valueOf(current);
                } else if (sign.equals("*")) {
                    result *= Float.valueOf(current);
                } else if (sign.equals("/")) {
                    result /= Float.valueOf(current);
                }
            } else {
                if (sign.equals("+")) {
                    Log.i("VALUE OF sign + ", sign);
                    result += Float.valueOf(current);
                    signPos += current.length();
                    signPos++;
                    sign = String.valueOf(result_text.charAt(signPos));
                } else if (sign.equals("-")) {
                    Log.i("VALUE OF sign - ", sign);
                    result -= Float.valueOf(current);
                    signPos += current.length();
                    signPos++;
                    sign = String.valueOf(result_text.charAt(signPos));
                } else if (sign.equals("*")) {
                    result *= Float.valueOf(current);
                    signPos += current.length();
                    signPos++;
                    sign = String.valueOf(result_text.charAt(signPos));
                } else if (sign.equals("/")) {
                    result /= Float.valueOf(current);
                    signPos += current.length();
                    signPos++;
                    sign = String.valueOf(result_text.charAt(signPos));
                }
            }
        }
        if (result % 1 == 0) {
            Log.i("DIVISIONE INTERA ", String.valueOf(result % 1));
            int r = (int) result;
            TextView resultTextView = (TextView) findViewById(R.id.result_text);
            resultTextView.setText(String.valueOf(r));
            result_text = String.valueOf(r);
            equals = true;
            result = 0;
        } else {
            TextView resultTextView = (TextView) findViewById(R.id.result_text);
            resultTextView.setText(String.valueOf(result));
            result_text = String.valueOf(result);
            equals = true;
            result = 0;
        }
    }
}
