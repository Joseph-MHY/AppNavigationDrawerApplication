package pe.edu.idat.appnavigationdrawerapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import pe.edu.idat.appnavigationdrawerapplication.databinding.FragmentPrincipalBinding

class PrincipalFragment : Fragment(), View.OnClickListener {
    private var _binding: FragmentPrincipalBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPrincipalBinding.inflate(inflater,
            container, false)
        binding.btnBuscar.setOnClickListener(this)
        return binding.root
    }

    override fun onClick(v: View?) {
        Toast.makeText(requireContext(),
            binding.etNombres.text.toString() + " " + binding.etApellidos.text.toString(),
            Toast.LENGTH_LONG).show()
    }
}