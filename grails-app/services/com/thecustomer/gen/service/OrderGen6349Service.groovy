// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class OrderGen6349Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for priority (generated filler). */
    def computePriority0() { return 9134 }
    /** Derived accessor for category (generated filler). */
    def computeCategory1() { return 2783 }
    /** Derived accessor for active (generated filler). */
    def computeActive2() { return 7534 }
    /** Derived accessor for label (generated filler). */
    def computeLabel3() { return 5047 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn4() { return 2564 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice5() { return 1638 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName6() { return 2371 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId7() { return 688 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId8() { return 7545 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName9() { return 938 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName10() { return 4730 }
    /** Derived accessor for label (generated filler). */
    def computeLabel11() { return 2340 }
    /** Derived accessor for label (generated filler). */
    def computeLabel12() { return 6794 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount13() { return 720 }
    /** Derived accessor for priority (generated filler). */
    def computePriority14() { return 3677 }
    /** Derived accessor for version (generated filler). */
    def computeVersion15() { return 5749 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold16() { return 863 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence17() { return 5485 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId18() { return 666 }
    /** Derived accessor for category (generated filler). */
    def computeCategory19() { return 1744 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity20() { return 2405 }
    /** Derived accessor for region (generated filler). */
    def computeRegion21() { return 6292 }
    /** Derived accessor for category (generated filler). */
    def computeCategory22() { return 9647 }
}
