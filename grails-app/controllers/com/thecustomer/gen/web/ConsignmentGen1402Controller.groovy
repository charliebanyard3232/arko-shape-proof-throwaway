// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class ConsignmentGen1402Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [consignmentCount: max, generated: true]
    }

    def show(Long id) {
        [consignmentId: id]
    }
    /** Derived accessor for status (generated filler). */
    def computeStatus0() { return 3302 }
    /** Derived accessor for priority (generated filler). */
    def computePriority1() { return 3427 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency2() { return 755 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg3() { return 9535 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg4() { return 2948 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName5() { return 8900 }
    /** Derived accessor for reference (generated filler). */
    def computeReference6() { return 5498 }
    /** Derived accessor for reference (generated filler). */
    def computeReference7() { return 4720 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence8() { return 9819 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder9() { return 9737 }
    /** Derived accessor for code (generated filler). */
    def computeCode10() { return 1942 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity11() { return 662 }
    /** Derived accessor for version (generated filler). */
    def computeVersion12() { return 2997 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity13() { return 2206 }
    /** Derived accessor for label (generated filler). */
    def computeLabel14() { return 5484 }
    /** Derived accessor for priority (generated filler). */
    def computePriority15() { return 4070 }
    /** Derived accessor for region (generated filler). */
    def computeRegion16() { return 5870 }
    /** Derived accessor for status (generated filler). */
    def computeStatus17() { return 5898 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage18() { return 178 }
    /** Derived accessor for label (generated filler). */
    def computeLabel19() { return 888 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn20() { return 7572 }
    /** Derived accessor for label (generated filler). */
    def computeLabel21() { return 8768 }
    /** Derived accessor for version (generated filler). */
    def computeVersion22() { return 727 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg23() { return 772 }
}
