package rs.strba.veleprodaja.presentation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import rs.strba.veleprodaja.R
import rs.strba.veleprodaja.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setIcon(R.drawable.ic_baseline_shopping_cart_checkout)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        binding.toolbar
            .setupWithNavController(navController, appBarConfiguration)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.loginFragment || destination.id == R.id.registrationFragment) {
                binding.bottomNavigation.visibility = View.GONE
            } else {
                binding.bottomNavigation.visibility = View.VISIBLE
            }
        }

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_create_worker -> createWorker(navController)
                R.id.action_view_workers -> viewWorkers(navController)
                R.id.action_create_buyer -> createBuyer(navController)
                R.id.action_view_buyers -> viewBuyers(navController)
            }
            true
        }
    }

    private fun viewBuyers(navController: NavController) {
        navController.navigate(R.id.viewBuyersFragment)
    }

    private fun createBuyer(navController: NavController) {
        navController.navigate(R.id.createBuyerFragment)
    }

    private fun viewWorkers(navController: NavController) {
        navController.navigate(R.id.viewWorkersFragment)
    }

    private fun createWorker(navController: NavController) {
        navController.navigate(R.id.createWorkerFragment)
    }
}