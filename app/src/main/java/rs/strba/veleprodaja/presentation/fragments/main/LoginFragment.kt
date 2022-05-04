package rs.strba.veleprodaja.presentation.fragments.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.Navigation
import rs.strba.veleprodaja.R
import rs.strba.veleprodaja.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var _binding: FragmentLoginBinding

    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.btnSignUp.setOnClickListener {
            view?.let { Navigation.findNavController(it).navigate(R.id.registrationFragment) }
        }
    }
}

