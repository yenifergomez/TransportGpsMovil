package com.example.transportgps.ui.Editar_Perfil

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.transportgps.databinding.FragmentEditarperfilBinding


class EditarPerfilFragment : Fragment() {

    private var _binding: FragmentEditarperfilBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val EditarperfilViewModel =
            ViewModelProvider(this).get(EditarPerfilViewModel::class.java)

        _binding = FragmentEditarperfilBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textEditarPerfil
        EditarperfilViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}