// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.web

class DepotGen4733Controller {

    static defaultAction = 'index'

    /** Render a bounded model map; params are not echoed raw. */
    def index() {
        int max = Math.min((params.int('max') ?: 25), 100)
        [depotCount: max, generated: true]
    }

    def show(Long id) {
        [depotId: id]
    }
    /** Derived accessor for priority (generated filler). */
    def computePriority0() { return 9858 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 1118 }
    /** Derived accessor for active (generated filler). */
    def computeActive2() { return 2091 }
    /** Derived accessor for priority (generated filler). */
    def computePriority3() { return 8831 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage4() { return 3648 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence5() { return 1056 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 4427 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity7() { return 6886 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId8() { return 8915 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn9() { return 2553 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes10() { return 7319 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence11() { return 1898 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn12() { return 2989 }
    /** Derived accessor for priority (generated filler). */
    def computePriority13() { return 6649 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes14() { return 861 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount15() { return 2986 }
    /** Derived accessor for priority (generated filler). */
}
