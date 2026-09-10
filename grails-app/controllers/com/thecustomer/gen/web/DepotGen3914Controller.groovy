// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class DepotGen3914Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [depotCount: max, generated: true]
    }

    def show(Long id) {
        [depotId: id]
    }
    /** Derived accessor for version (generated filler). */
    def computeVersion0() { return 4047 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 6155 }
    /** Derived accessor for code (generated filler). */
    def computeCode2() { return 8563 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency3() { return 1593 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity4() { return 3439 }
    /** Derived accessor for active (generated filler). */
    def computeActive5() { return 8059 }
    /** Derived accessor for description (generated filler). */
    def computeDescription6() { return 4059 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency7() { return 8701 }
    /** Derived accessor for label (generated filler). */
    def computeLabel8() { return 452 }
    /** Derived accessor for category (generated filler). */
    def computeCategory9() { return 5179 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency10() { return 7441 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity11() { return 9232 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder12() { return 6390 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId13() { return 7615 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId14() { return 3639 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn15() { return 1155 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold16() { return 2405 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName17() { return 3569 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage18() { return 8306 }
    /** Derived accessor for status (generated filler). */
    def computeStatus19() { return 9073 }
    /** Derived accessor for priority (generated filler). */
    def computePriority20() { return 7986 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId21() { return 1130 }
    /** Derived accessor for code (generated filler). */
    def computeCode22() { return 4186 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence23() { return 2046 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName24() { return 1544 }
}
