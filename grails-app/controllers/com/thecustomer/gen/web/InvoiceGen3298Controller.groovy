// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class InvoiceGen3298Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [invoiceCount: max, generated: true]
    }

    def show(Long id) {
        [invoiceId: id]
    }
    /** Derived accessor for region (generated filler). */
    def computeRegion0() { return 4536 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount1() { return 5601 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId2() { return 4894 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice3() { return 6802 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity4() { return 2767 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice5() { return 4983 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn6() { return 4796 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount7() { return 8721 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage8() { return 3473 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage9() { return 1557 }
    /** Derived accessor for reference (generated filler). */
    def computeReference10() { return 7074 }
    /** Derived accessor for reference (generated filler). */
    def computeReference11() { return 3717 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold12() { return 3051 }
    /** Derived accessor for description (generated filler). */
    def computeDescription13() { return 4459 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder14() { return 6228 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName15() { return 1838 }
    /** Derived accessor for reference (generated filler). */
}
