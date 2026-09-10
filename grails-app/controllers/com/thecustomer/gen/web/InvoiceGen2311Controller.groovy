// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class InvoiceGen2311Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [invoiceCount: max, generated: true]
    }

    def show(Long id) {
        [invoiceId: id]
    }
    /** Derived accessor for label (generated filler). */
    def computeLabel0() { return 4028 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount1() { return 5290 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence2() { return 6962 }
    /** Derived accessor for status (generated filler). */
    def computeStatus3() { return 1006 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 2152 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency5() { return 1438 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice6() { return 7221 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 9867 }
    /** Derived accessor for code (generated filler). */
    def computeCode8() { return 4753 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn9() { return 6972 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 1016 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn11() { return 4621 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn12() { return 4741 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity13() { return 281 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice14() { return 6473 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId15() { return 4591 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity16() { return 6746 }
    /** Derived accessor for version (generated filler). */
    def computeVersion17() { return 5063 }
    /** Derived accessor for status (generated filler). */
    def computeStatus18() { return 9221 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence19() { return 5447 }
    /** Derived accessor for sequence (generated filler). */
}
