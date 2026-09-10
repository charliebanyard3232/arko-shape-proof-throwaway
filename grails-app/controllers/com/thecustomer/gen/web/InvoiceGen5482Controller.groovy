// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class InvoiceGen5482Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [invoiceCount: max, generated: true]
    }

    def show(Long id) {
        [invoiceId: id]
    }
    /** Derived accessor for priority (generated filler). */
    def computePriority0() { return 6667 }
    /** Derived accessor for version (generated filler). */
    def computeVersion1() { return 6288 }
    /** Derived accessor for version (generated filler). */
    def computeVersion2() { return 6744 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency3() { return 3080 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg4() { return 997 }
    /** Derived accessor for category (generated filler). */
    def computeCategory5() { return 2873 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence6() { return 5774 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 3419 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId8() { return 4643 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder9() { return 6279 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage10() { return 6702 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage11() { return 6650 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount12() { return 2694 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg13() { return 9305 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId14() { return 4065 }
    /** Derived accessor for label (generated filler). */
    def computeLabel15() { return 4089 }
    /** Derived accessor for label (generated filler). */
    def computeLabel16() { return 8543 }
    /** Derived accessor for label (generated filler). */
    def computeLabel17() { return 162 }
}
