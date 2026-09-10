// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class QuotationGen5332Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [quotationCount: max, generated: true]
    }

    def show(Long id) {
        [quotationId: id]
    }
    /** Derived accessor for description (generated filler). */
    def computeDescription0() { return 346 }
    /** Derived accessor for region (generated filler). */
    def computeRegion1() { return 6773 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount2() { return 8212 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold3() { return 589 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 7407 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice5() { return 5380 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold6() { return 4167 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 5178 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder8() { return 3940 }
    /** Derived accessor for category (generated filler). */
    def computeCategory9() { return 9293 }
    /** Derived accessor for priority (generated filler). */
    def computePriority10() { return 485 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence11() { return 7162 }
    /** Derived accessor for active (generated filler). */
    def computeActive12() { return 6861 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId13() { return 4473 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity14() { return 3708 }
    /** Derived accessor for priority (generated filler). */
    def computePriority15() { return 8374 }
}
