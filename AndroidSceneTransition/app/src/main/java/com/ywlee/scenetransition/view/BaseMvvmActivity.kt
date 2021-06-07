package com.ywlee.scenetransition.view

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.ywlee.scenetransition.viewmodel.BaseViewModel


abstract class BaseMvvmActivity<VB: ViewDataBinding, VM: BaseViewModel>: BaseActivity() {
    protected lateinit var mBinding: VB
    protected lateinit var mViewModel: VM


    /**
     * 액티비티의 R.layout 리소스 리턴
     * setContentView 에서 사용
     *
     * @return 해당 액티비티가 사용할 Layout resource
     */
    @LayoutRes
    protected abstract fun getLayoutId(): Int

    /**
     * 액티비티에서 사용할 ViewModel Class 리턴
     *
     * @return 액티비티에서 사용할 viewmodel class::java
     */
    protected abstract fun getViewModel(): Class<VM>

    /**
     * ViewModel 변수 변화 감지
     */
    protected abstract fun observeViewModelVariables()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initDataBinding()
        observeBasicViewModelVariables()
        observeViewModelVariables()
    }

    /**
     * Data binding 초기 설정
     */
    private fun initDataBinding() {
        mBinding = DataBindingUtil.setContentView(this, getLayoutId())

        mViewModel = ViewModelProvider(this).get(getViewModel())
        mBinding.lifecycleOwner = this
        mBinding.executePendingBindings()
    }

    /**
     * Base View Model 의 변수 감시 (공통 로딩, api error handler 등..)
     */
    private fun observeBasicViewModelVariables() {

    }
}