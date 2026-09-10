// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class RebateGen4187Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [rebateCount: max, generated: true]
    }

    def show(Long id) {
        [rebateId: id]
    }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency0() { return 4588 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg1() { return 1085 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence2() { return 4756 }
    /** Derived accessor for description (generated filler). */
    def computeDescription3() { return 8155 }
    /** Derived accessor for label (generated filler). */
    def computeLabel4() { return 7333 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount5() { return 2206 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder6() { return 3175 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount7() { return 2902 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId8() { return 5987 }
    /** Derived accessor for region (generated filler). */
    def computeRegion9() { return 7535 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes10() { return 9148 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice11() { return 1868 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder12() { return 5640 }
    /** Derived accessor for priority (generated filler). */
    def computePriority13() { return 8916 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn14() { return 1619 }
    /** Derived accessor for status (generated filler). */
    def computeStatus15() { return 3393 }
    /** Derived accessor for priority (generated filler). */
    def computePriority16() { return 5592 }
}
