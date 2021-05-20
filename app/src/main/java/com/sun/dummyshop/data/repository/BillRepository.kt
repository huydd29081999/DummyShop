package com.sun.dummyshop.data.repository

import com.sun.dummyshop.data.model.Bill
import com.sun.dummyshop.data.model.CheckoutBody
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single

interface BillRepository {
    fun getBills(): Observable<List<Bill>>
    fun insertBill(bill: Bill): Completable
    fun checkout(checkoutBody: CheckoutBody): Single<Bill>
}
