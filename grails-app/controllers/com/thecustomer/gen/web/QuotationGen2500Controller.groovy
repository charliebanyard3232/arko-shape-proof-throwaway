// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class QuotationGen2500Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [quotationCount: max, generated: true]
    }

    def show(Long id) {
        [quotationId: id]
    }
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 9662 }
    /** Derived accessor for code (generated filler). */
    def computeCode1() { return 1657 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId2() { return 6961 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 885 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage4() { return 6071 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg5() { return 8919 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence6() { return 5926 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName7() { return 7705 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName8() { return 919 }
    /** Derived accessor for status (generated filler). */
    def computeStatus9() { return 1285 }
    /** Derived accessor for category (generated filler). */
    def computeCategory10() { return 5493 }
    /** Derived accessor for region (generated filler). */
    def computeRegion11() { return 8096 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId12() { return 3144 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice13() { return 8920 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn14() { return 4133 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency15() { return 7763 }
    /** Derived accessor for description (generated filler). */
    def computeDescription16() { return 4318 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage17() { return 6664 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder18() { return 7386 }
}
