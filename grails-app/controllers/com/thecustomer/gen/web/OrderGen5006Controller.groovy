// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class OrderGen5006Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [orderCount: max, generated: true]
    }

    def show(Long id) {
        [orderId: id]
    }
    /** Derived accessor for code (generated filler). */
    def computeCode0() { return 5934 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg1() { return 9847 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 9464 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId3() { return 3203 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice4() { return 8626 }
    /** Derived accessor for active (generated filler). */
    def computeActive5() { return 1302 }
    /** Derived accessor for priority (generated filler). */
    def computePriority6() { return 3033 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold7() { return 6516 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 3778 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName9() { return 6724 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes10() { return 3025 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage11() { return 1396 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold12() { return 541 }
    /** Derived accessor for category (generated filler). */
    def computeCategory13() { return 4885 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice14() { return 5842 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn15() { return 1349 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName16() { return 9271 }
}
