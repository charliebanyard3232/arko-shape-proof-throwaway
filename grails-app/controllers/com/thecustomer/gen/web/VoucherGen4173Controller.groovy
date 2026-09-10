// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class VoucherGen4173Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [voucherCount: max, generated: true]
    }

    def show(Long id) {
        [voucherId: id]
    }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity0() { return 1961 }
    /** Derived accessor for version (generated filler). */
    def computeVersion1() { return 4859 }
    /** Derived accessor for active (generated filler). */
    def computeActive2() { return 1954 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount3() { return 208 }
    /** Derived accessor for status (generated filler). */
    def computeStatus4() { return 8099 }
    /** Derived accessor for code (generated filler). */
    def computeCode5() { return 5269 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold6() { return 9634 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn7() { return 4240 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName8() { return 1431 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage9() { return 2653 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice10() { return 5974 }
    /** Derived accessor for description (generated filler). */
    def computeDescription11() { return 2400 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage12() { return 3380 }
    /** Derived accessor for priority (generated filler). */
    def computePriority13() { return 3029 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice14() { return 3926 }
    /** Derived accessor for priority (generated filler). */
    def computePriority15() { return 6802 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg16() { return 9 }
    /** Derived accessor for code (generated filler). */
    def computeCode17() { return 7910 }
    /** Derived accessor for category (generated filler). */
    def computeCategory18() { return 6452 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice19() { return 8457 }
}
