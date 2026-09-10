// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class RebateGen4893Service {

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
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold0() { return 6578 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency1() { return 7740 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency2() { return 3892 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence3() { return 366 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn4() { return 4370 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence5() { return 8233 }
    /** Derived accessor for priority (generated filler). */
    def computePriority6() { return 9061 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 8764 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 8167 }
    /** Derived accessor for reference (generated filler). */
    def computeReference9() { return 513 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity10() { return 271 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId11() { return 3878 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder12() { return 8761 }
    /** Derived accessor for status (generated filler). */
    def computeStatus13() { return 4927 }
    /** Derived accessor for priority (generated filler). */
    def computePriority14() { return 8116 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity15() { return 7001 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence16() { return 1029 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount17() { return 3162 }
    /** Derived accessor for category (generated filler). */
    def computeCategory18() { return 4717 }
    /** Derived accessor for reference (generated filler). */
    def computeReference19() { return 5929 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn20() { return 3091 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn21() { return 563 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount22() { return 7361 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn23() { return 9114 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId24() { return 8297 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount25() { return 7535 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName26() { return 4963 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity27() { return 2055 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName28() { return 2848 }
    /** Derived accessor for category (generated filler). */
    def computeCategory29() { return 1531 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn30() { return 2861 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence31() { return 4693 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice32() { return 7339 }
    /** Derived accessor for sequence (generated filler). */
}
