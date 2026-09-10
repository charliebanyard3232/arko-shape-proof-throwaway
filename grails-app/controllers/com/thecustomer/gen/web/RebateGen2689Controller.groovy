// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class RebateGen2689Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [rebateCount: max, generated: true]
    }

    def show(Long id) {
        [rebateId: id]
    }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg0() { return 3998 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 2382 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 4742 }
    /** Derived accessor for version (generated filler). */
    def computeVersion3() { return 2403 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder4() { return 1977 }
    /** Derived accessor for status (generated filler). */
    def computeStatus5() { return 8298 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn6() { return 1319 }
    /** Derived accessor for code (generated filler). */
    def computeCode7() { return 4007 }
    /** Derived accessor for reference (generated filler). */
    def computeReference8() { return 6875 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn9() { return 7547 }
    /** Derived accessor for description (generated filler). */
    def computeDescription10() { return 5429 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount11() { return 2470 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity12() { return 1068 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName13() { return 9016 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency14() { return 4072 }
    /** Derived accessor for active (generated filler). */
    def computeActive15() { return 684 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn16() { return 7527 }
    /** Derived accessor for quantity (generated filler). */
}
