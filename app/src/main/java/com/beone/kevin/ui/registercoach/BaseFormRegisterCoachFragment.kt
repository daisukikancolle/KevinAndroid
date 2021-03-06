package com.beone.kevin.ui.registercoach

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import com.beone.kevin.R
import kotlinx.android.synthetic.main.base_form_register_coach_fragment.*
import kotlinx.android.synthetic.main.base_form_register_employee_fragment.*

abstract class BaseFormRegisterCoachFragment : Fragment() {

    private lateinit var viewModel: RegisterCoachViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.base_form_register_coach_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ll_registercoach.setOnClickListener { hideKeyboard(ll_registercoach) }
    }

    fun hideKeyboard(view: View) {
        val imm =
            requireContext().getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}