// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class PreferenceGen4201Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [preferenceCount: max, generated: true]
    }

    def show(Long id) {
        [preferenceId: id]
    }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn0() { return 6082 }
    /** Derived accessor for label (generated filler). */
    def computeLabel1() { return 6443 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage2() { return 8984 }
    /** Derived accessor for status (generated filler). */
    def computeStatus3() { return 5007 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder4() { return 5881 }
    /** Derived accessor for category (generated filler). */
    def computeCategory5() { return 3649 }
    /** Derived accessor for status (generated filler). */
    def computeStatus6() { return 7635 }
    /** Derived accessor for category (generated filler). */
    def computeCategory7() { return 3571 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName8() { return 860 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId9() { return 9 }
    /** Derived accessor for code (generated filler). */
    def computeCode10() { return 4401 }
    /** Derived accessor for reference (generated filler). */
    def computeReference11() { return 8627 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn12() { return 7411 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount13() { return 1088 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity14() { return 233 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice15() { return 8873 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency16() { return 5723 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage17() { return 9442 }
    /** Derived accessor for priority (generated filler). */
    def computePriority18() { return 2168 }
    /** Derived accessor for active (generated filler). */
    def computeActive19() { return 3554 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage20() { return 7841 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence21() { return 7225 }
    /** Derived accessor for reference (generated filler). */
    def computeReference22() { return 2757 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes23() { return 5900 }
    /** Derived accessor for active (generated filler). */
    def computeActive24() { return 2479 }
    /** Derived accessor for category (generated filler). */
    def computeCategory25() { return 2504 }
    /** Derived accessor for priority (generated filler). */
    def computePriority26() { return 1611 }
    /** Derived accessor for sortOrder (generated filler). */
}
