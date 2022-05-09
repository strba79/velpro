package rs.strba.veleprodaja.presentation.fragments.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import rs.strba.veleprodaja.MyApplication
import rs.strba.veleprodaja.R
import rs.strba.veleprodaja.databinding.FragmentLoginBinding
import rs.strba.veleprodaja.databinding.FragmentRegistrationBinding
import rs.strba.veleprodaja.presentation.di.ComponentInjector
import rs.strba.veleprodaja.presentation.viewmodels.main.LoginFragmentViewModel
import rs.strba.veleprodaja.presentation.viewmodels.main.LoginFragmentViewModelFactory
import rs.strba.veleprodaja.presentation.viewmodels.main.RegistrationFragmentViewModel
import rs.strba.veleprodaja.presentation.viewmodels.main.RegistrationFragmentViewModelFactory
import javax.inject.Inject

class RegistrationFragment : Fragment() {


    @Inject
    lateinit var factoryRegistrationFragmentViewModelFactory: RegistrationFragmentViewModelFactory
    lateinit var model: RegistrationFragmentViewModel

    private lateinit var _binding: FragmentRegistrationBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegistrationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (activity?.application as MyApplication).appComponent.velProSubComponentRegistration()
            .create()
        (activity?.application as ComponentInjector).createVelProSubComponentRegistration()
            .injectRegistration(this)
        model = ViewModelProvider(
            requireParentFragment(),
            factoryRegistrationFragmentViewModelFactory
        )[RegistrationFragmentViewModel::class.java]

        binding.btnRegistration.setOnClickListener {
            lifecycleScope.launchWhenCreated {
                model.createUser(
                    binding.etBuyerName.text.toString(),
                    binding.etUsername.text.toString(),
                    binding.etPassword.text.toString()
                )
                Toast.makeText(context,"User created",Toast.LENGTH_LONG).show()
            }
        }
    }
}