// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class OrderGen4467Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [orderCount: max, generated: true]
    }

    def show(Long id) {
        [orderId: id]
    }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence0() { return 2613 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId1() { return 4039 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency2() { return 7452 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity3() { return 906 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence4() { return 6901 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder5() { return 8304 }
    /** Derived accessor for reference (generated filler). */
    def computeReference6() { return 4496 }
    /** Derived accessor for reference (generated filler). */
    def computeReference7() { return 1465 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency8() { return 4003 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId9() { return 1545 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName10() { return 4854 }
    /** Derived accessor for category (generated filler). */
    def computeCategory11() { return 7440 }
    /** Derived accessor for description (generated filler). */
    def computeDescription12() { return 1005 }
    /** Derived accessor for label (generated filler). */
    def computeLabel13() { return 1972 }
    /** Derived accessor for version (generated filler). */
    def computeVersion14() { return 2420 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName15() { return 7106 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold16() { return 9761 }
    /** Derived accessor for label (generated filler). */
}
