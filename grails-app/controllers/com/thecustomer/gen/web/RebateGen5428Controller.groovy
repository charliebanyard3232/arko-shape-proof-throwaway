// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class RebateGen5428Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [rebateCount: max, generated: true]
    }

    def show(Long id) {
        [rebateId: id]
    }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity0() { return 5812 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn1() { return 7688 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName2() { return 82 }
    /** Derived accessor for description (generated filler). */
    def computeDescription3() { return 3668 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice4() { return 5224 }
    /** Derived accessor for reference (generated filler). */
    def computeReference5() { return 5298 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId6() { return 7931 }
    /** Derived accessor for reference (generated filler). */
    def computeReference7() { return 3443 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount8() { return 4512 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes9() { return 838 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId10() { return 4430 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn11() { return 3523 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg12() { return 6697 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg13() { return 3472 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId14() { return 4195 }
    /** Derived accessor for priority (generated filler). */
    def computePriority15() { return 6707 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence16() { return 8438 }
}
