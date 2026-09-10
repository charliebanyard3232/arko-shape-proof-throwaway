// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class InvoiceGen4712Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [invoiceCount: max, generated: true]
    }

    def show(Long id) {
        [invoiceId: id]
    }
    /** Derived accessor for description (generated filler). */
    def computeDescription0() { return 2448 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg1() { return 9303 }
    /** Derived accessor for active (generated filler). */
    def computeActive2() { return 9562 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency3() { return 2670 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity4() { return 2310 }
    /** Derived accessor for reference (generated filler). */
    def computeReference5() { return 7298 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName6() { return 8411 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 5777 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 623 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency9() { return 8283 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence10() { return 2213 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId11() { return 7138 }
    /** Derived accessor for description (generated filler). */
    def computeDescription12() { return 532 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName13() { return 2689 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice14() { return 3984 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold15() { return 4964 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName16() { return 4440 }
    /** Derived accessor for status (generated filler). */
    def computeStatus17() { return 703 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn18() { return 1115 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName19() { return 2538 }
    /** Derived accessor for priority (generated filler). */
    def computePriority20() { return 3443 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount21() { return 3578 }
    /** Derived accessor for weightKg (generated filler). */
}
