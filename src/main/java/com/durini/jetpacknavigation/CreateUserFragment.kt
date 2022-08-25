package com.durini.jetpacknavigation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputLayout


class CreateUserFragment : Fragment(R.layout.fragment_create_user) {

    private lateinit var buttonCreate: Button
    private lateinit var inputEmail: TextInputLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonCreate = view.findViewById(R.id.button_createFragment_home)
        inputEmail = view.findViewById(R.id.inputLayout_LoginFragment_email)
        setListeners()
    }

    private fun setListeners() {
        buttonCreate.setOnClickListener {
            val action = CreateUserFragmentDirections.actionCreateUserFragmentToHomeFragment(
                email = inputEmail.editText!!.text.toString(),
                fullName = "Hola!, necesitamos que actualices tu perfil"
            )
            requireView().findNavController().navigate(action)
        }
    }
}