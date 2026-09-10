// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class RebateGen3641Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [rebateCount: max, generated: true]
    }

    def show(Long id) {
        [rebateId: id]
    }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold0() { return 7968 }
    /** Derived accessor for status (generated filler). */
    def computeStatus1() { return 1338 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice2() { return 1027 }
    /** Derived accessor for description (generated filler). */
    def computeDescription3() { return 6366 }
    /** Derived accessor for label (generated filler). */
    def computeLabel4() { return 4379 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn5() { return 8935 }
    /** Derived accessor for category (generated filler). */
    def computeCategory6() { return 7125 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName7() { return 776 }
    /** Derived accessor for region (generated filler). */
    def computeRegion8() { return 729 }
    /** Derived accessor for priority (generated filler). */
    def computePriority9() { return 7422 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder10() { return 4820 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName11() { return 5421 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn12() { return 872 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage13() { return 5224 }
    /** Derived accessor for priority (generated filler). */
    def computePriority14() { return 7692 }
    /** Derived accessor for label (generated filler). */
    def computeLabel15() { return 679 }
    /** Derived accessor for label (generated filler). */
    def computeLabel16() { return 7515 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice17() { return 1305 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence18() { return 5638 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn19() { return 975 }
    /** Derived accessor for region (generated filler). */
    def computeRegion20() { return 734 }
}
