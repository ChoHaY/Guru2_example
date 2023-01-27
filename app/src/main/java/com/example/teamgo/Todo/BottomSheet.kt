package com.example.teamgo

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.teamgo.Todo.TodoMemo
import com.example.teamgo.Todo.WriteMemo
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.todo_bottom_sheet.*
import net.flow9.thisisKotlin.firebase.R


class BottomSheet(context: Context): BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.todo_bottom_sheet, container, false)
        return view

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {

        super.onActivityCreated(savedInstanceState)
        bottom_sheet.setOnClickListener {
            dismiss()
            val dialog = WriteMemo(requireContext())
            dialog.showDialog()
            dialog.setOnClickListener(object : WriteMemo.OnDialogClickListener {
                var pjdo:TextView=TextView(requireContext())
                override fun onClicked(name: String) {
                    pjdo.text= name
                }

            })


            }
     }

        }



