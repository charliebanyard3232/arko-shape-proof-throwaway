// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class DepotGen4194Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [depotCount: max, generated: true]
    }

    def show(Long id) {
        [depotId: id]
    }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId0() { return 9865 }
    /** Derived accessor for active (generated filler). */
    def computeActive1() { return 4871 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency2() { return 2430 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 3029 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage4() { return 5000 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount5() { return 5897 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName6() { return 8263 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice7() { return 1614 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg8() { return 6040 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes9() { return 8624 }
    /** Derived accessor for region (generated filler). */
    def computeRegion10() { return 3618 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency11() { return 5958 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes12() { return 5948 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId13() { return 8171 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity14() { return 3094 }
    /** Derived accessor for reference (generated filler). */
    def computeReference15() { return 2383 }
    /** Derived accessor for active (generated filler). */
    def computeActive16() { return 2531 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes17() { return 1258 }
    /** Derived accessor for code (generated filler). */
    def computeCode18() { return 6470 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId19() { return 977 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount20() { return 8317 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount21() { return 7423 }
    /** Derived accessor for status (generated filler). */
    def computeStatus22() { return 8718 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder23() { return 8727 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes24() { return 8206 }
    /** Derived accessor for status (generated filler). */
}
