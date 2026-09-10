// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ReceiptGen3675Service {

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
    def computeThreshold0() { return 6396 }
    /** Derived accessor for active (generated filler). */
    def computeActive1() { return 3904 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence2() { return 8408 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn3() { return 9760 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 461 }
    /** Derived accessor for version (generated filler). */
    def computeVersion5() { return 515 }
    /** Derived accessor for version (generated filler). */
    def computeVersion6() { return 6033 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount7() { return 6472 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency8() { return 763 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg9() { return 3863 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId10() { return 5472 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold11() { return 436 }
    /** Derived accessor for reference (generated filler). */
    def computeReference12() { return 8393 }
    /** Derived accessor for label (generated filler). */
    def computeLabel13() { return 2839 }
    /** Derived accessor for label (generated filler). */
    def computeLabel14() { return 6537 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold15() { return 4939 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount16() { return 9982 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId17() { return 5114 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount18() { return 2773 }
    /** Derived accessor for description (generated filler). */
    def computeDescription19() { return 5608 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName20() { return 6178 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId21() { return 8266 }
    /** Derived accessor for priority (generated filler). */
    def computePriority22() { return 9963 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage23() { return 1845 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder24() { return 2331 }
    /** Derived accessor for active (generated filler). */
}
