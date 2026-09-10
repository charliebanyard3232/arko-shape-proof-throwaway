// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class TenancyGen3361Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [tenancyCount: max, generated: true]
    }

    def show(Long id) {
        [tenancyId: id]
    }
    /** Derived accessor for reference (generated filler). */
    def computeReference0() { return 5779 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 1958 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount2() { return 3763 }
    /** Derived accessor for category (generated filler). */
    def computeCategory3() { return 6000 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount4() { return 6627 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency5() { return 7687 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId6() { return 5534 }
    /** Derived accessor for category (generated filler). */
    def computeCategory7() { return 686 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage8() { return 5086 }
    /** Derived accessor for label (generated filler). */
    def computeLabel9() { return 3795 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder10() { return 7495 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice11() { return 3859 }
    /** Derived accessor for active (generated filler). */
    def computeActive12() { return 1086 }
    /** Derived accessor for category (generated filler). */
    def computeCategory13() { return 4699 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn14() { return 3423 }
    /** Derived accessor for reference (generated filler). */
    def computeReference15() { return 1807 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn16() { return 5075 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold17() { return 3139 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage18() { return 8908 }
    /** Derived accessor for active (generated filler). */
    def computeActive19() { return 9576 }
    /** Derived accessor for active (generated filler). */
}
