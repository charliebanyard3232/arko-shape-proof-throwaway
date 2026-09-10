// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class ShipmentGen0235Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [shipmentCount: max, generated: true]
    }

    def show(Long id) {
        [shipmentId: id]
    }
    /** Derived accessor for priority (generated filler). */
    def computePriority0() { return 315 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName1() { return 176 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 6585 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice3() { return 3594 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg4() { return 5401 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold5() { return 4532 }
    /** Derived accessor for version (generated filler). */
    def computeVersion6() { return 3481 }
    /** Derived accessor for description (generated filler). */
    def computeDescription7() { return 9098 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName8() { return 4230 }
    /** Derived accessor for active (generated filler). */
    def computeActive9() { return 2754 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder10() { return 2431 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold11() { return 7512 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence12() { return 1451 }
    /** Derived accessor for status (generated filler). */
    def computeStatus13() { return 9656 }
    /** Derived accessor for reference (generated filler). */
    def computeReference14() { return 3644 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency15() { return 4632 }
    /** Derived accessor for category (generated filler). */
}
