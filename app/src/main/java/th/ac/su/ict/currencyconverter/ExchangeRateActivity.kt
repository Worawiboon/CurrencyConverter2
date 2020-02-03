package th.ac.su.ict.currencyconverter

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ExchangeRateActivity : AppCompatActivity() {

    var exchangeRate:Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exchange_rate)

        var edtRate = findViewById<EditText>(R.id.edtRate)

        exchangeRate = intent.getDoubleExtra("rate",-1.0)

        edtRate.setText(exchangeRate.toString())

        var btnSave = findViewById<Button>(R.id.btnSave)
        btnSave.setOnClickListener{

            var intent = Intent()
            intent.putExtra("rate",edtRate.text.toString().toDouble())
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}
