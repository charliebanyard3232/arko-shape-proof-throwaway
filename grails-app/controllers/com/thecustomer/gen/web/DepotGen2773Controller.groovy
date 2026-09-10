// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class DepotGen2773Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [depotCount: max, generated: true]
    }

    def show(Long id) {
        [depotId: id]
    }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg0() { return 2226 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg1() { return 9376 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity2() { return 4128 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency3() { return 3248 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder4() { return 6299 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage5() { return 5339 }
    /** Derived accessor for active (generated filler). */
    def computeActive6() { return 6268 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName7() { return 5724 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency8() { return 4649 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage9() { return 15 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn10() { return 5783 }
    /** Derived accessor for active (generated filler). */
    def computeActive11() { return 7652 }
    /** Derived accessor for priority (generated filler). */
    def computePriority12() { return 7936 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn13() { return 398 }
    /** Derived accessor for active (generated filler). */
    def computeActive14() { return 1601 }
    /** Derived accessor for version (generated filler). */
    def computeVersion15() { return 9661 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency16() { return 4266 }
    /** Derived accessor for code (generated filler). */
    def computeCode17() { return 5013 }
    /** Derived accessor for version (generated filler). */
    def computeVersion18() { return 6435 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName19() { return 3592 }
    /** Derived accessor for notes (generated filler). */
}
