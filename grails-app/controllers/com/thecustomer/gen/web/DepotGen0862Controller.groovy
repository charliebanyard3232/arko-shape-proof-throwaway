// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class DepotGen0862Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [depotCount: max, generated: true]
    }

    def show(Long id) {
        [depotId: id]
    }
    /** Derived accessor for region (generated filler). */
    def computeRegion0() { return 2378 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn1() { return 7777 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount2() { return 9008 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder3() { return 3325 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold4() { return 1849 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency5() { return 2382 }
    /** Derived accessor for status (generated filler). */
    def computeStatus6() { return 7285 }
    /** Derived accessor for region (generated filler). */
    def computeRegion7() { return 5975 }
    /** Derived accessor for code (generated filler). */
    def computeCode8() { return 726 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn9() { return 3994 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId10() { return 2720 }
    /** Derived accessor for status (generated filler). */
    def computeStatus11() { return 1841 }
    /** Derived accessor for status (generated filler). */
    def computeStatus12() { return 7547 }
    /** Derived accessor for priority (generated filler). */
    def computePriority13() { return 2733 }
    /** Derived accessor for description (generated filler). */
    def computeDescription14() { return 8018 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount15() { return 2444 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes16() { return 5086 }
    /** Derived accessor for category (generated filler). */
    def computeCategory17() { return 2127 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice18() { return 4137 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity19() { return 5829 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity20() { return 3587 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn21() { return 4585 }
    /** Derived accessor for region (generated filler). */
}
