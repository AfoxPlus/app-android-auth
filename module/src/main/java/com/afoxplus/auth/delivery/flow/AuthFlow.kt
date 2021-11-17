package com.afoxplus.auth.delivery.flow

import javax.inject.Inject

interface AuthFlow {

    //TODO: All public flows for access to module

    companion object {
        fun build(): AuthFlow = AuthFlowImpl()
    }
}


internal class AuthFlowImpl @Inject constructor() : AuthFlow {

}