package rs.strba.veleprodaja.presentation.fragments.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.Navigation
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import rs.strba.veleprodaja.MyApplication
import rs.strba.veleprodaja.R
import rs.strba.veleprodaja.databinding.FragmentLoginBinding
import rs.strba.veleprodaja.presentation.di.ComponentInjector
import rs.strba.veleprodaja.presentation.viewmodels.main.LoginFragmentViewModel
import rs.strba.veleprodaja.presentation.viewmodels.main.LoginFragmentViewModelFactory
import javax.inject.Inject

class LoginFragment : Fragment() {

    @Inject
    lateinit var factoryLoginFragmentViewModelFactory: LoginFragmentViewModelFactory
    lateinit var model: LoginFragmentViewModel

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
        (activity?.application as MyApplication).appComponent.velProSubComponentLogin().create()
        (activity?.application as ComponentInjector).createVelProSubComponentLogin()
            .injectLogin(this)
        model = ViewModelProvider(
            requireParentFragment(),
            factoryLoginFragmentViewModelFactory
        )[LoginFragmentViewModel::class.java]

        binding.btnLogIn.setOnClickListener {
            lifecycleScope.launchWhenCreated {
                if (model.getUser(
                        binding.etUsername.text.toString(),
                        binding.etPassword.text.toString()
                    ) != null
                ) {
                    view?.let {
                        Navigation.findNavController(it)
                            .navigate(R.id.action_loginFragment_to_createWorkerFragment)
                    }
                } else {
                        Toast.makeText(context, "User not found", Toast.LENGTH_LONG).show()
                }
            }
        }
        binding.btnSignUp.setOnClickListener {
            view?.let {
                Navigation.findNavController(it)
                    .navigate(R.id.action_loginFragment_to_registrationFragment)
            }
        }
    }
}

