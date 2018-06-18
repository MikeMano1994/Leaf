package cog.com.leafpic.fragments

import android.content.Context

import cog.com.leafpic.items.ActionsListener

/**
 * Base class for fragments showing any kind of Media in a Grid fashion.
 *
 * Allows selection, multiple select Context Menus, etc.
 */
abstract class BaseMediaGridFragment : BaseFragment(), IFragment, ActionsListener {

    var editModeListener: EditModeListener? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is EditModeListener) editModeListener = context
    }

    fun onBackPressed() = when (editMode()) {
        true -> clearSelected()
        false -> false
    }
}
