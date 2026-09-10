// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class RebateGen4915Controller {

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
    def computeThreshold0() { return 345 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 7917 }
    /** Derived accessor for status (generated filler). */
    def computeStatus2() { return 2089 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder3() { return 1686 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 3168 }
    /** Derived accessor for reference (generated filler). */
    def computeReference5() { return 2695 }
    /** Derived accessor for active (generated filler). */
    def computeActive6() { return 9480 }
    /** Derived accessor for active (generated filler). */
    def computeActive7() { return 1240 }
    /** Derived accessor for reference (generated filler). */
    def computeReference8() { return 4362 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity9() { return 6959 }
    /** Derived accessor for active (generated filler). */
    def computeActive10() { return 7686 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn11() { return 9393 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn12() { return 4196 }
    /** Derived accessor for active (generated filler). */
    def computeActive13() { return 7732 }
    /** Derived accessor for priority (generated filler). */
    def computePriority14() { return 9397 }
    /** Derived accessor for displayName (generated filler). */
}
