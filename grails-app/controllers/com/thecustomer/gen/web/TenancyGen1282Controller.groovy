// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class TenancyGen1282Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [tenancyCount: max, generated: true]
    }

    def show(Long id) {
        [tenancyId: id]
    }
    /** Derived accessor for label (generated filler). */
    def computeLabel0() { return 262 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg1() { return 4071 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder2() { return 1635 }
    /** Derived accessor for priority (generated filler). */
    def computePriority3() { return 9365 }
    /** Derived accessor for reference (generated filler). */
    def computeReference4() { return 8097 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg5() { return 4132 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity6() { return 7200 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 9095 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder8() { return 6315 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity9() { return 2335 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 8850 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName11() { return 8621 }
    /** Derived accessor for category (generated filler). */
    def computeCategory12() { return 9130 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity13() { return 2821 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice14() { return 1875 }
    /** Derived accessor for category (generated filler). */
    def computeCategory15() { return 7668 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId16() { return 3018 }
    /** Derived accessor for active (generated filler). */
    def computeActive17() { return 4283 }
    /** Derived accessor for category (generated filler). */
    def computeCategory18() { return 286 }
    /** Derived accessor for status (generated filler). */
    def computeStatus19() { return 3737 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold20() { return 9592 }
    /** Derived accessor for amount (generated filler). */
}
