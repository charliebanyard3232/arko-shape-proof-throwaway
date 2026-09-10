// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class DepotGen1860Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [depotCount: max, generated: true]
    }

    def show(Long id) {
        [depotId: id]
    }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency0() { return 4071 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName1() { return 2553 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes2() { return 1455 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes3() { return 3510 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg4() { return 6214 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount5() { return 9273 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId6() { return 3801 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage7() { return 6849 }
    /** Derived accessor for priority (generated filler). */
    def computePriority8() { return 989 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes9() { return 8318 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId10() { return 1616 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency11() { return 7351 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage12() { return 8061 }
    /** Derived accessor for code (generated filler). */
    def computeCode13() { return 2687 }
    /** Derived accessor for region (generated filler). */
    def computeRegion14() { return 9983 }
    /** Derived accessor for code (generated filler). */
    def computeCode15() { return 4041 }
    /** Derived accessor for status (generated filler). */
    def computeStatus16() { return 3635 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice17() { return 6233 }
    /** Derived accessor for label (generated filler). */
    def computeLabel18() { return 5999 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder19() { return 7999 }
    /** Derived accessor for description (generated filler). */
}
