// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class ConsignmentGen2409Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [consignmentCount: max, generated: true]
    }

    def show(Long id) {
        [consignmentId: id]
    }
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 2682 }
    /** Derived accessor for active (generated filler). */
    def computeActive1() { return 3643 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold2() { return 1840 }
    /** Derived accessor for reference (generated filler). */
    def computeReference3() { return 5157 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence4() { return 2596 }
    /** Derived accessor for code (generated filler). */
    def computeCode5() { return 6574 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId6() { return 8872 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold7() { return 706 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn8() { return 8815 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency9() { return 838 }
    /** Derived accessor for category (generated filler). */
    def computeCategory10() { return 3868 }
    /** Derived accessor for reference (generated filler). */
    def computeReference11() { return 6241 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence12() { return 8434 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency13() { return 5187 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg14() { return 551 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg15() { return 5646 }
}
