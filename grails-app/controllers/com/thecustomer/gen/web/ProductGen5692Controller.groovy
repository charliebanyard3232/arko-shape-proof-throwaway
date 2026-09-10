// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class ProductGen5692Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [productCount: max, generated: true]
    }

    def show(Long id) {
        [productId: id]
    }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice0() { return 941 }
    /** Derived accessor for region (generated filler). */
    def computeRegion1() { return 533 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence2() { return 5616 }
    /** Derived accessor for category (generated filler). */
    def computeCategory3() { return 3369 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder4() { return 6034 }
    /** Derived accessor for code (generated filler). */
    def computeCode5() { return 4239 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn6() { return 1546 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity7() { return 3569 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount8() { return 4920 }
    /** Derived accessor for category (generated filler). */
    def computeCategory9() { return 5366 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder10() { return 9969 }
    /** Derived accessor for region (generated filler). */
    def computeRegion11() { return 7367 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence12() { return 6235 }
    /** Derived accessor for active (generated filler). */
    def computeActive13() { return 2113 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn14() { return 8666 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity15() { return 4159 }
    /** Derived accessor for active (generated filler). */
    def computeActive16() { return 2801 }
    /** Derived accessor for region (generated filler). */
    def computeRegion17() { return 9237 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage18() { return 908 }
    /** Derived accessor for reference (generated filler). */
    def computeReference19() { return 7427 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg20() { return 1422 }
    /** Derived accessor for category (generated filler). */
    def computeCategory21() { return 4731 }
    /** Derived accessor for region (generated filler). */
    def computeRegion22() { return 4534 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName23() { return 6636 }
}
