import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio2_dh.R
import com.example.desafio2_dh.adapter.viewHolder.CervejariaViewHolder
import com.example.desafio2_dh.model.Cervejaria
import com.example.desafio2_dh.view.CervejariaPrincipalActivity

class CervejariaAdapter (val cervejariaList: List<Cervejaria>): RecyclerView.Adapter<CervejariaViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CervejariaViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_cervejaria, parent, false)
        return CervejariaViewHolder(view)

    }

    override fun onBindViewHolder(holder: CervejariaViewHolder, position: Int) {

        val image = holder.imageCervejaria
        val singleImage = cervejariaList[position].cervejariaImage
        image.setImageResource(cervejariaList[position].cervejariaImage)

        val name = holder.nameCervejaria
        name.text = cervejariaList[position].cervejariaName
        val singleName = name.text

        val address = holder.addressCervejaria
        address.text = cervejariaList[position].cervejariaAddress

        val closingTime = holder.closingTimeCervejaria
        val closingText: String = "Fecha às "
        val time = cervejariaList[position].cervejariaClosingTime
        closingTime.text = closingText.plus(time)

        val card = holder.itemView
        card.setOnClickListener {
            Log.i("CLICK", "${name.text} was selected")
            val intent = Intent(it.context, CervejariaPrincipalActivity::class.java)
            intent.putExtra("IMAGE", cervejariaList[position].cervejariaImage)
            intent.putExtra("NAME", cervejariaList[position].cervejariaName)
            it.context.startActivity(intent)

        }
    }

    override fun getItemCount() = cervejariaList.size
}