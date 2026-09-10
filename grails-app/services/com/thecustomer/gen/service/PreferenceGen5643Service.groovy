// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen5643Service {

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
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId0() { return 471 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName1() { return 4239 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency2() { return 939 }
    /** Derived accessor for version (generated filler). */
    def computeVersion3() { return 9241 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg4() { return 6053 }
    /** Derived accessor for status (generated filler). */
    def computeStatus5() { return 2654 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId6() { return 1400 }
    /** Derived accessor for priority (generated filler). */
    def computePriority7() { return 531 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn8() { return 6881 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage9() { return 663 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency10() { return 4330 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice11() { return 4644 }
}
