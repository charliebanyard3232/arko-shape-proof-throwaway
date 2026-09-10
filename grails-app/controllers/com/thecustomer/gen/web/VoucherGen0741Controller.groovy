// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class VoucherGen0741Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [voucherCount: max, generated: true]
    }

    def show(Long id) {
        [voucherId: id]
    }
    /** Derived accessor for version (generated filler). */
    def computeVersion0() { return 3817 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 3419 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg2() { return 3463 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount3() { return 3455 }
    /** Derived accessor for reference (generated filler). */
    def computeReference4() { return 6856 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage5() { return 131 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId6() { return 2742 }
    /** Derived accessor for active (generated filler). */
    def computeActive7() { return 9988 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName8() { return 4832 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage9() { return 901 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence10() { return 7196 }
    /** Derived accessor for active (generated filler). */
    def computeActive11() { return 1010 }
    /** Derived accessor for label (generated filler). */
    def computeLabel12() { return 5671 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn13() { return 2027 }
    /** Derived accessor for label (generated filler). */
    def computeLabel14() { return 2440 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage15() { return 4999 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg16() { return 9142 }
    /** Derived accessor for category (generated filler). */
    def computeCategory17() { return 9171 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold18() { return 5048 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice19() { return 6451 }
}
